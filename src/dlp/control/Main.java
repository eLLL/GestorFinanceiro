package dlp.control;

import dlp.view.Menu;

public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        DAO dao = new DAO();

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Menu().setVisible(true);
            }
        });
    }
}
