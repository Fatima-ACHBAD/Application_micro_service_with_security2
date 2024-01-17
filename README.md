# L'utilisation de keycloak pour sécuriser l'application #

### Keycloak is an open source software product to allow single sign-on with identity and access management aimed at modern applications and services. As of March 2018 this WildFly community project is under the stewardship of Red Hat who use it as the upstream project for their Red Hat Single Sign-On product. ###




<details>

-Lancement de keycloak  en ligne de commande et son interface

![keycloak1](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/6f76fe94-1e4b-40c5-bc99-e8c2af96a21a)
-Master Realm
![keycloak2](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/6bf98af2-187f-423b-a088-489ca6b49a41)

-Création de notre propre realm de notre application : wallet-realm
![keycloak3](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/ffb7a1aa-5594-4808-b0eb-005f5706616e)

-Création de client : ajout d'ID
![keycloak3client](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/eec79878-c464-4de7-95e2-050b6e28b2af)

-Suite d'information sur le client :
![keycloak4client](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/4d372f29-39ca-4221-970d-7f0d9fe8ab25)
-Création d'utilisateur
![keycloak5user](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/13437c9e-f347-428a-9534-4bedc7028613)

-Spécifier le mdp de l'utilisateur
![keycloak6usermdp](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/5b541f73-9f88-473c-9630-826b3b87c79c)
-Création de role :
![keycloak7role](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/a52b7449-1a5d-47f1-b489-a9901458f9ca)

-Assigner un role à l'utilisateur
![keycloak8role_user](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/02261606-d326-43f6-b1c9-71f9682c69e1)
-Test postman
![keycloak9testpostman](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/e8ca3c29-1726-4f8e-9a33-33861050a0fa)

-Test postman et jwt pour vérifier Token
![keycloak10postmanandjwt](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/b67e6755-569d-4f51-b942-b05a19a94734)

-Test postman et refresh token

![keycloak11postmanandrefreshtoken](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/131b3861-7d17-4ef7-b50a-7edf892d07ae)

-Configuration d'authentication dans Keycloak
![keycloak12configauthetication](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/b82552c0-e6fd-4335-9db7-a77d1ef2aaa3)

![keycloak13configauthetication](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/d52bc18d-6010-4cd3-9f89-ef73e746da63)
-Test postman d'authentication

![keycloak14configautheticationpostman](https://github.com/Fatima-ACHBAD/E_commerce_application_with_micro_service/assets/100408189/34aa554a-f9de-49b0-9e75-bef91516750b)

# Sécuriser l'application #

-Création  de projet dans google 
![createprojetingooglecloudconsole1](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security/assets/100408189/1742ad4d-e667-4a24-aa66-581db47b9435)

-Configuration de google cloud consol pour Création d'identifiant 
![createidentifiantingooglecloudconsole2](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security/assets/100408189/e45d1ad8-3a4f-45e9-aa7f-409ab9353b45)

-Création d'identifiant 
![createidentifiant_auth_information_ingooglecloudconsole3](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security/assets/100408189/0df50802-d336-4c61-bd52-7d80206871a6)

-Résumer de creation 
![summariesofcreation4](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security/assets/100408189/b249ec88-cfc3-4fa9-8f5b-9cea84170d93)

-Ajout de configuration dans application_properties
![summariesofcreation5inapplication_properties](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security/assets/100408189/336849dc-8f59-4f51-8fcc-6cf31a7a2bee)

-Specifier uri de direction
![specifieruride_direction_6](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security/assets/100408189/01c59348-5617-4422-8803-8ab29171a26d)

</details>
