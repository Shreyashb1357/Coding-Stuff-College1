package app.Models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.stream.Stream;
import java.io.File;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;


import com.fasterxml.jackson.databind.ObjectMapper;

public class Shopmodel {
    private Iteminfo[] item;

    public Shopmodel() {
        item = load("Met.store");
    }

    public Iteminfo getItem(String name) {
        return Stream.of(item)
            .filter(r-> r.id().equals(name))
            .findFirst()
            .orElse(null);
    }

    public void addItem(String name , double cost , int stock) {
                Iteminfo newItem = new Iteminfo(name, cost, stock);
        save(newItem);
        
    }

    // public static void save(Iteminfo[] entry) {
    //     String document = "Met.store" ;
    //     var serial = new ObjectMapper();
    //     try(var output = new FileOutputStream(document,true)) {
    //         serial.writeValue(output , entry);
    //     } catch(Exception e) {}
    // }
    //         Iteminfo newItem = new Iteminfo(name, cost, stock);
    //     save(newItem);
    // }

    public static void save(Iteminfo entry) {
        String document = "Met.store";
        ObjectMapper mapper = new ObjectMapper();
        List<Iteminfo> items = new ArrayList<>();

       
        File file = new File(document);
        if (file.exists() && file.length() > 0) {
            try (FileInputStream input = new FileInputStream(file)) {
                items = mapper.readValue(input, new TypeReference<List<Iteminfo>>() {});
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        items.add(entry);

        try (FileOutputStream output = new FileOutputStream(file)) {
            mapper.writerWithDefaultPrettyPrinter().writeValue(output, items);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Iteminfo[] load(String document) {
        var serial = new ObjectMapper();
        try(var input = new FileInputStream(document)) {
            return serial.readValue(input , Iteminfo[].class);
        } catch(IOException e) {throw new RuntimeException(e);}
    }
}