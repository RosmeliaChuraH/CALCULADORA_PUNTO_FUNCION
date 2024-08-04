using System;
using System.Data;
using System.Linq;
using System.Text;
using System.Drawing;
using System.Windows.Forms;
using System.ComponentModel;
using System.Threading.Tasks;
using CalculadoraPuntoFuncion;
using System.Collections.Generic;

namespace prueba1
{
    public partial class RESULTADO : Form
    {
        public RESULTADO()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            PuntoFuncion P = new PuntoFuncion();
            P.Show();
            this.Hide();
            
        }

        private void RESULTADO_Load(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
