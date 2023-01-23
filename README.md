# WinesPractica1
Practica #1


WinesApiary

FORMAT: 1A
HOST: https://polls.apiblueprint.org/

# Wines


## Questions Collection [/wines/wines_list]

### List All Wines [GET]

+ Response 200 (application/json)

        [
            {
                "id": "2501",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/0/8/08437000859949.1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Remirez de Ganuza",
                "type":"Gran Reserva",
                "age":"2018",
                "score":"3.5"
            },{
                "id": "2502",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000009410-vino-tinto-achaval-ferrer-finca-mirador---750-ml-1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Achaval Ferrer Finca Mirador",
                "type":"Malbec",
                "age":"2008",
                "score":"5"
            },{
                "id": "2503",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/0/7/07798127630011.1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Sottano",
                "type":"Malbec",
                "age":"2013",
                "score":"4"
            },{
                "id": "2504",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/2/12655_1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "La Terre Rouge",
                "type":"Tinto",
                "age":"1999",
                "score":"4.5"
            },{
                "id": "2505",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000008629-vino-espumoso-sidra-emilio-martinez-brut--nature.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Emilio Martinez Brut Nature",
                "type":"Espumoso",
                "age":"2021",
                "score":"2.5"
            },{
                "id": "2506",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000004868.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Marques De Caceres",
                "type":"Rosado",
                "age":"2021",
                "score":"3.5"
            },{
                "id": "2507",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000022449.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Pierola Tempranillo",
                "type":"Blanco",
                "age":"2022",
                "score":"3"
            },{
                "id": "2508",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000001602-vino-blanco-macon-villages-g.-duboeuf---750ml.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Macon Villages G. Duboeuf",
                "type":"Blanco",
                "age":"2017",
                "score":"4.5"
            },{
                "id": "2509",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000021975.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "Estefanya Navidad",
                "type":"Cabernet Sauvignon",
                "age":"2018",
                "score":"5"
            },{
                "id": "2510",
                "thumbnail": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000019315.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700",
                "name": "The Guv´Nor Red Blend",
                "type":"Tinto",
                "age":"2015",
                "score":"4"
            }
        ]

## Wine 2501 [/wines/wines_detail/2501]

### Get wine detail 2501 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Remirez de Ganuza", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/0/8/08437000859949.1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Aroma equilibrado, complejo, fruta madura, especiado, fina reducción.",
            "type":"Gran Reserva",
            "age":"2018",
            "color":"Purpura",
            "region":"España",
            "pairing":"Jamón, quesos no muy curados, guisos con salsas no muy especiadas, legumbres cocidas o guisadas, aves, carnes rojas, carnes a la parrilla y asados."
            
        }
        
## Wine 2502 [/wines/wines_detail/2502]

### Get wine detail 2502 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Achaval Ferrer Finca Mirador", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000009410-vino-tinto-achaval-ferrer-finca-mirador---750-ml-1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Tiene un carácter sabroso con grafito, cuero y pimienta. Las hierbas y especias le agregan personalidad.",
            "type":"Malbec",
            "age":"2008",
            "color":"Rubí",
            "region":"Argentina",
            "pairing":"Combinan muy bien con papas fritas, carnes de ternera, riñón y bistec."
            
        }
        
        
## Wine 2503 [/wines/wines_detail/2503]

### Get wine detail 2503 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Sottano", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/0/7/07798127630011.1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "De buena estructura taninos aterciopelados y elegantes le dan un largo final.",
            "type":"Malbec",
            "age":"2013",
            "color":"Rojo intenso",
            "region":"Argentina",
            "pairing":"Frutos rojos maduros como ciruelas y frambuesas, acomplejadas por el delicado chocolate y la vainilla aportados por su paso en madera."
            
        }
        
## Wine 2504 [/wines/wines_detail/2504]

### Get wine detail 2504 [GET]

+ Response 200 (application/json)

        
        {
            "name": "La Terre Rouge", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/2/12655_1.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Suave, flexible, sin amargura ni astringencia.",
            "type":"Tinto",
            "age":"1999",
            "color":"Rojo rubí, bastante intenso.",
            "region":"Francia",
            "pairing":"Ideal con carne roja, carne de cerdo, queso."
            
        }
        
## Wine 2505 [/wines/wines_detail/2505]

### Get wine detail 2505 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Emilio Martinez Brut Nature", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000008629-vino-espumoso-sidra-emilio-martinez-brut--nature.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Buen ataque, goloso pero claramente seco, un carbónico bastante bien integrado, excelente acidez, suaves amargos y notable longitud.",
            "type":"Espumoso",
            "age":"2021",
            "color":"Color amarillo dorado.",
            "region":"España",
            "pairing":" Mucha fruta, casi todo manzna verde fresca y sensaciones más ligeras de corte cítrico"
            
        }
        
        
## Wine 2506 [/wines/wines_detail/2506]

### Get wine detail 2506 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Marques De Caceres", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000004868.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Presenta un precioso color coral pálido. Nariz salpicada de un delicado fondo floral (toques a violeta y clavel), notas a frutos rojos sobre un suave recuerdo anisado.",
            "type":"Rosado",
            "age":"2021",
            "color":"Rosado Intenso",
            "region":"Rioja",
            "pairing":"Perfecto para acompañar la cocina mediterránea, fritura, verduras a la parrilla, legumbres, paella, arroces, pasta, pescado en salsa de tomate, jamones y chorizos, patés, carnes asadas, estofadas o a la parrilla, quesos suaves o semicurados."
            
        }
        
        
## Wine 2507 [/wines/wines_detail/2507]

### Get wine detail 2507 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Pierola Tempranillo", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000022449.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Carácter voluminoso y envolvente, equilibrado en su acidez/alcohol, que intensifica frescura y juventud.",
            "type":"Blanco",
            "age":"2022",
            "color":"Amarillo Paja",
            "region":"España",
            "pairing":"Frutas tropicales (plátano, piñas licuadas) y ciertos recuerdos herbáceos."
            
        }
        
## Wine 2508 [/wines/wines_detail/2508]

### Get wine detail 2508 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Macon Villages G. Duboeuf", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000001602-vino-blanco-macon-villages-g.-duboeuf---750ml.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Carácter voluminoso y envolvente, equilibrado en su acidez/alcohol.",
            "type":"Blanco",
            "age":"2017",
            "color":"Bello color amarillo",
            "region":"Francia",
            "pairing":"Frutas tropicales."
            
        }
        
## Wine 2509 [/wines/wines_detail/2509]

### Get wine detail 2509 [GET]

+ Response 200 (application/json)

        
        {
            "name": "Estefanya Navidad", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000021975.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "Aromático, elegante con buena intensidad. Recuerdos de fruta negra madura, monte bajo, balsámicos. Fondo con toques de nobles cueros y vainilla",
            "type":"Cabernet Sauvignon",
            "age":"2018",
            "color":"Rojo profundo y tonos ladrillo",
            "region":"Chile",
            "pairing":"Ideal para acompañar masas y pastas, cocina italiana en general, quesos blancos y frescos."
            
        }
        
## Wine 2510 [/wines/wines_detail/2510]

### Get wine detail 2510 [GET]

+ Response 200 (application/json)

        
        {
            "name": "The Guv´Nor Red Blend", 
            "image": "https://www.laeuropea.com.mx/media/catalog/product/1/0/10000019315.jpg?optimize=high&bg-color=255,255,255&fit=bounds&height=700&width=600&canvas=600:700", 
            "description": "En boca resulta complejo, amplio, vivo. En boca resaltan las notas afrutadas, minerales, sobre finas sensaciones de cacao. Final persistente y elegante",
            "type":"Tinto",
            "age":"2015",
            "color":"Color rojo picota, con capa media-alta y ribete compacto",
            "region":"Toro La Mancha",
            "pairing":"Vino ideal para acompañar tapas y aperitivos, quesos curados, carnes magras y platos de caza"
            
        }
        
