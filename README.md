de Saxce Pierre
G2 ILSEN
[![codecov](https://codecov.io/gh/pierredesaxce/ceri-m1-techniques-de-test/branch/master/graph/badge.svg?token=UKNP6MKTNI)](https://codecov.io/gh/pierredesaxce/ceri-m1-techniques-de-test)
[![CircleCI](https://circleci.com/gh/pierredesaxce/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://circleci.com/gh/pierredesaxce/ceri-m1-techniques-de-test/tree/master)
![CheckStyle](target/checkstyle-result.svg)

La RocketPokemonFactory ne passe pas les tests correspondant aux metadata. Les noms, attaques, endurances et defenses générés sont incorrects.
Mes tests initiaux ne permettaient pas de verifier cela. J'ai donc du ajouter  des tests de vérification afin de m'assurer que les valeurs de metadata sont bien entre la valeur de base et la valeur maximum possible de ces stats (+15).
En plus de cela, la Factory fourni par la team rocket peut generer des Pokemon dont l'index est negatif ce qui devrait etre impossible.