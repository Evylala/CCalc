WANG Evelyne

Réponse question 3.2
Non car cela change l'utilisation de la fonction eval : les types doivent être connus.

Remarques :
Les tests ne passent pas tous et j'ai remarqué plusieurs types d'erreur :
- "Cannot run program "/bin/bash": CreateProcess error=2, Le fichier spécifié est introuvable"
- "...mismatched input '=' expecting {<EOF>, '+', '*', '-', '<', '!=', '<=', '&&', '?', '||', '>', 
	'/', '==', '>='}"   
Ces erreurs apparaîssent alors que le programme de test n'attend pas une erreur, 
il y a donc un problème dans mon code, mais probablement aussi dans la grammaire.
Je n'ai malheureusement pas réussi à identifier ces erreurs.