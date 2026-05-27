#include <iostream>
#include <string>
using namespace std;

int main() {
    string nombres[100];
    double notas[100];
    int cantidad = 0, opcion = 0;

    do {
        cout << "\n--- MENU ---\n1. Registrar\n2. Reporte\n3. Buscar\n4. Salir\nOpcion: ";
        cin >> opcion;

        if (opcion == 1) {
            cout << "Cantidad de alumnos: "; cin >> cantidad;
            for (int i = 0; i < cantidad; i++) {
                cout << "Nombre: "; cin >> nombres[i];
                cout << "Nota: "; cin >> notas[i];
            }
        } else if (opcion == 2 && cantidad > 0) {
            double suma = 0; int aprob = 0, reprob = 0;
            for (int i = 0; i < cantidad; i++) {
                suma += notas[i];
                if (notas[i] >= 7) aprob++; else reprob++;
            }
            cout << "Promedio: " << (suma/cantidad) << "\nAprobados: " << aprob << "\nReprobados: " << reprob << "\n";
        } else if (opcion == 3) {
            string buscar; cout << "Buscar nombre: "; cin >> buscar;
            bool enc = false;
            for (int i = 0; i < cantidad; i++) {
                if (nombres[i] == buscar) {
                    cout << "Nombre: " << nombres[i] << " | Nota: " << notas[i];
                    cout << " | Estado: " << (notas[i] >= 7 ? "Aprobado" : "Reprobado") << "\n";
                    enc = true; break;
                }
            }
            if (!enc) cout << "El estudiante " << buscar << " no se encuentra registrado.\n";
        }
    } while (opcion != 4);
    return 0;
}
