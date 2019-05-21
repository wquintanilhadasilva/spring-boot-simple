package start;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import api.services.BoletoService;

public class Lab {

	public static void main(String[] args) {
		
		BoletoService.gerar();
		
		boolean b1 = true, b2 = false, b3 = false;
		
		System.out.println(b1 || b2 && b3);
		
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
//		System.out.println(((Boolean.class). "false").toString());
		
		convertListToMap();
	}
	
	
	private static void convertListToMap() {
		
		Map<String, String> v1 = new HashMap<String, String>();
		v1.put("col1", "val1");
		
		Map<String, String> v2 = new HashMap<String, String>();
		v2.put("col2", "val2");
		
		Map<String, String> v3 = new HashMap<String, String>();
		v3.put("col3", "val3");
		
		List<Map<String, String>> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        
//        Map<String, String> result = new HashMap<String, String>();
        
//        list.forEach(map -> 
//        	result.putAll(map.entrySet().stream().collect(Collectors.toMap(entry -> entry., valueMapper)));
//		}); 
        
        Map<String, String> result = new HashMap<>();
        list.stream().forEach(map -> {
            result.putAll(map.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> (String) entry.getValue())));
        });
        
//        .stream() .collect(Collectors.toMap(s -> s.get("key"), s -> s.get("value")));
        
        System.out.println(result);
        
	}

}
