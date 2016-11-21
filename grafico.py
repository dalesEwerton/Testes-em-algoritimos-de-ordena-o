import matplotlib.pyplot as plt


dataset = open('sort.txt', 'r')

insertionX = []
insertiony = []
selectionX = []
selectionY = []
mergeX = []
mergeY = []
quickX = []
quickY = []

for line in dataset:
	line = line.strip()
	X, Y , Z = line.split(" ")
	
	if X == "instertion":
		insertionX.append(Y)
		insertiony.append(Z)
	elif X == "selection":
		selectionX.append(Y)
		selectionY.append(Z)
	elif X == "merge":
		mergeX.append(Y)
		mergeY.append(Z)
	else:
		quickX.append(Y)
		quickY.append(Z)

plt.xlabel("Tempo de Execucao")
plt.ylabel("Tamanho do Array")
plt.title("Funcoes de Custo de Algoritimos de Ordenacao")

plt.plot(insertionX, insertiony)
plt.plot(selectionX, selectionY)
plt.plot(mergeX, mergeY)
plt.plot(quickX, quickY)

plt.show()
