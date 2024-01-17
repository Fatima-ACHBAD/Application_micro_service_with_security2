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
-création de projet en github
![createprojetingithub1](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/ec43dec6-8795-4581-a09c-2ac3b232a14b)
-Résumer des informations 
![summariesgithub2](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/53643285-1841-42ef-9c32-ff8912fe4e98)
-Ajout de la config de github dans application_properties
![summariesgithub_and_addin_application_properties3](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/0d9161a8-90a3-4a74-b6b5-dbbbb5494ed2)
--Ajout de la config de Keycklock dans application_properties
![configuration_Keycklock_test_projet_inINTELLIJ4](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/6c6cc0b6-361d-4f27-bd94-a28616670ff1)
-tester de token dans jwt
![test_in_jwt_token5](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/8f78513f-8edd-43fe-9d04-cae7fca1233a)
-Lancer l'application : 3mode de connexion valide :
![application_runner_6](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/8f315861-c61f-415a-b2a5-a31768c92345)
-Se connecter dans l'application avec github
![application_runner__in_github7](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/4f7f8808-d9c1-4daf-b793-3c7e74b8e93e)
-Se connecter dans l'application avec google

![application_runner__in_google8](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/a74fdf99-1d53-4516-8765-3596b3164113)

-Se connecter dans l'application avec keycklock
![application_runner__in_keycklock11111](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/ce895a11-7aad-4733-bb54-f2fd086f5b19)

-Configuration keycloak scope
![keycklockscop1](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/ea524798-aa5a-4f29-95e4-97de8980bf2a)
- Configuration realm role et ajour de id token 
![user_realm_role_to_on_id_token2](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/0ed7a9f9-05c9-4d3f-a6ab-04836872eec8)
- User interface : Customers 
![application_UI_3_customers](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/33f65087-0da0-454f-b21a-05ce36adf82f)
- User interface : user2 et je me déconnecte  
![application_UI_4_logout_user2](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/23ad7ca7-4e13-4403-8317-26cad499b3d9)
- User interface : après logout automatiquement on est connecté comme anonymous user  
![application_UI_5_logout_anonymousUser](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/2868e72e-b5f3-4736-8a29-02eb1e32d3be)
- User interface : Compte github FATIMA_ACHBAD qui s'affiche 
  ![application_UI_6_logout_cpt_github_fatima_achbad](https://github.com/Fatima-ACHBAD/Application_micro_service_with_security2/assets/100408189/1446fc8a-eda7-414f-bfa8-0a21dcf195cc)

</details>



