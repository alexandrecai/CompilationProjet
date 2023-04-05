Pour compiler le programme il faut ouvrir un terminal à la racine du projet et écrire la commande suivante : 
javac -classpath lib/\* -d out */*.java

Les classes seront compilées dans le dossier out qui sera crée pour l'occasion.


Ensuite pour lancer le programme il suffit, tout en restant à la racine du projet, d'écrire la commande suivante :
java -cp out:lib/\* ast.Main nomFichierDeTest

J'ai mis à votre disposition des fichiers de test qui testent chacun une commande différentes. Vous pouvez ensuite créer les 
votres afin de tester ce que vous souhaitez. Chaque test possède 2 versions, une qui fonctionne et une qui renvoie une erreur
afin de pouvoir tester l'affichage des erreurs dans le code.

Pour lancer mes fichiers de tests il faut donc écrire les commandes suivantes :
java -cp out:lib/\* ast.Main testAff.jul
java -cp out:lib/\* ast.Main testAffError.jul
java -cp out:lib/\* ast.Main testDecl.jul
java -cp out:lib/\* ast.Main testDeclError.jul
java -cp out:lib/\* ast.Main testif.jul
java -cp out:lib/\* ast.Main testifError.jul
java -cp out:lib/\* ast.Main testlong.jul
java -cp out:lib/\* ast.Main testreturn.jul
java -cp out:lib/\* ast.Main testreturnError.jul
java -cp out:lib/\* ast.Main testwhile.jul
java -cp out:lib/\* ast.Main testwhileError.jul
