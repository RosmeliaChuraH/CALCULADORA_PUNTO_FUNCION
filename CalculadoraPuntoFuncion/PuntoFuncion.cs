using System;
using prueba1;
using System.Data;
using System.Linq;
using System.Text;
using System.Drawing;
using System.Windows.Forms;
using System.ComponentModel;
using System.Threading.Tasks;
using System.Collections.Generic;

namespace CalculadoraPuntoFuncion
{
    public partial class PuntoFuncion : Form
    {
        public PuntoFuncion()
        {
            InitializeComponent();
            

            // Establece el primer ítem como seleccionado por defecto
            comboBox1.SelectedIndex = 0;
        }

        private void label6_Click(object sender, EventArgs e)
        {

        }


        private void btn_calcular_Click(object sender, EventArgs e)
        {
            // Instanciar el formulario de resultados
            RESULTADO re = new RESULTADO();
            // Mostrar el formulario de resultados y ocultar el actual
            re.Show();
            this.Hide();

            // Obtener el índice seleccionado del ComboBox
            int opcion = comboBox1.SelectedIndex;
            

            int total, cuenta;
            double PFA, E, T;

            // Calcular el total de suma de los componentes "preguntas"
            total = Convert.ToInt32(com1.Text) + Convert.ToInt32(com2.Text) + Convert.ToInt32(com3.Text) + Convert.ToInt32(com4.Text) +
                Convert.ToInt32(com5.Text) + Convert.ToInt32(com6.Text) + Convert.ToInt32(com7.Text) + Convert.ToInt32(com8.Text) +
                Convert.ToInt32(com9.Text) + Convert.ToInt32(com10.Text) + Convert.ToInt32(com11.Text) + Convert.ToInt32(com12.Text) +
                Convert.ToInt32(com13.Text) + Convert.ToInt32(com14.Text);
            //muestra el total de la suma FAV
            re.text_Box1.Text = total.ToString();

            //calcular la cuenta total
            //cuenta = (Convert.ToInt32(textBox2.Text) * 4) + (Convert.ToInt32(textBox3.Text) * 3) + (Convert.ToInt32(textBox4.Text) * 4) +
                  //  (Convert.ToInt32(textBox5.Text) * 3) + (Convert.ToInt32(textBox6.Text) * 7);
            //re.text_Box2.Text = cuenta.ToString();


            // Calcular la cuenta total en función del parámetro seleccionado
            cuenta = CalcularCuentaTotal(opcion, Convert.ToInt32(textBox2.Text), Convert.ToInt32(textBox3.Text),
                                         Convert.ToInt32(textBox4.Text), Convert.ToInt32(textBox5.Text),
                                         Convert.ToInt32(textBox6.Text));
            re.text_Box2.Text = cuenta.ToString();


            //punto de funcion ajustada
            PFA = cuenta * (0.65 + 0.01 * total);
            // muestra el punto de fucion ajsutado
            re.text_Box3.Text = PFA.ToString();

            //Calculo del esfuerzo
            E = PFA / 0.125;
            //muestra el esfuerzo
            re.text_Box4.Text = E.ToString();

            //Calculo tiempo de duracion
            T = ((E / Convert.ToDouble(textBox7.Text)) / 20);
            re.text_Box5.Text = T.ToString();
        }

        private int CalcularCuentaTotal(int parametro, int entrada, int salida, int peticiones, int archivos, int interfaces)
        {
            int cuentaTotal = 0;
            if (parametro == 0)
            {
                cuentaTotal = (entrada * 4) + (salida * 3) + (peticiones * 4) + (archivos * 3) + (interfaces * 7);
            }
            else if (parametro == 1)
            {
                cuentaTotal = (entrada * 4) + (salida * 5) + (peticiones * 4) + (archivos * 10) + (interfaces * 7);
            }
            else if (parametro == 2)
            {
                cuentaTotal = (entrada * 6) + (salida * 7) + (peticiones * 6) + (archivos * 15) + (interfaces * 10);
            }

            return cuentaTotal;
        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {

        }

        private void PuntoFuncion_Load(object sender, EventArgs e)
        {

        }

        private void label21_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            this.Close();
        }
    }
}
