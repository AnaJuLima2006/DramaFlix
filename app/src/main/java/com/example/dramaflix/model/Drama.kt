package com.example.dramaflix.model

import com.example.dramaflix.R

data class Drama(
    val titulo: String,
    val genero: String,
    val sinopse: String,
    val imageResId: Int
)

fun sorteiaDrama(genero: String): Drama {
    val dramas = when (genero) {
        "Ação" -> listOf(
            Drama("Vincenzo", "Ação", "Um advogado coreano, criado pela máfia italiana, retorna à Coreia. Com charme e brutalidade, ele enfrenta corporações corruptas, espalhando justiça com sua própria lei.", R.drawable.vincenzo),
            Drama("Itaewon Class", "Ação", "Após perder o pai injustamente, um jovem rebelde ergue um bar em Itaewon. Desafiando um império empresarial, ele luta com coragem e idealismo por justiça e redenção.", R.drawable.itaewon_class),
            Drama("Bad and Crazy", "Ação", "Um detetive ambicioso vê sua vida virar caos ao surgir uma versão heroica e insana de si mesmo. Juntos, enfrentam a corrupção num duelo entre loucura e redenção.", R.drawable.bad_and_crazy),
            Drama("Vagabond", "Ação", "Após perder seu sobrinho em um trágico acidente, um dublê mergulha num perigoso jogo de espionagem. Conspirações globais e traições o cercam em busca da verdade.", R.drawable.vagabond),
            Drama("My Name", "Ação", "Sedenta por vingança, uma jovem se infiltra na polícia a mando de um chefe do crime. Entre balas e segredos, ela confronta sua dor e descobre quem realmente é.", R.drawable.my_name),
            Drama("The K2", "Ação", "Um ex-soldado se torna guarda-costas de uma família política poderosa. Em meio a jogos de poder e um amor proibido, ele luta contra fantasmas do passado e da guerra.", R.drawable.the_k2),
            Drama("Taxi Driver", "Ação", "Um grupo secreto transforma dor em justiça. Disfarçados de taxistas, eles ajudam vítimas a se vingar de criminosos que a lei deixou impunes. A vingança é o combustível.", R.drawable.taxi_driver),
            Drama("A Juíza do Inferno", "Ação", "Conhecida por sua frieza, uma juíza implacável persegue criminosos poderosos. Sua balança da justiça pesa dor e redenção, num tribunal onde a verdade queima.", R.drawable.juiza_do_inferno),
            Drama("Flower of Evil", "Ação", "Um homem com um passado manchado pelo crime finge ser o marido perfeito. Quando sua esposa, uma detetive, começa a investigar, o amor e a verdade colidem.", R.drawable.flower_of_evil),
            Drama("Healer", "Ação", "Um mensageiro noturno com habilidades letais se envolve com uma repórter destemida. Juntos, desvendam segredos do passado em meio a conspirações e amor proibido.", R.drawable.healer),
            Drama("Mouse", "Ação", "Em um mundo onde psicopatas podem ser detectados, um detetive enfrenta uma série de crimes brutais. Um jogo de gato e rato se inicia, revelando verdades sombrias.", R.drawable.mouse),
            Drama("The Glory", "Ação", "Marcada pela violência do passado, uma mulher orquestra sua vingança com frieza. Cada gesto é um passo na coreografia da dor que ela transforma em glória.", R.drawable.the_glory),
            Drama("Ele é Psicométrico", "Ação", "Com um toque, ele vê o passado. Um jovem com psicometria junta-se a uma detetive para resolver crimes. Entre segredos e cicatrizes, descobrem a verdade e a si mesmos.", R.drawable.psicometrico)
        )

        "Comédia" -> listOf(
            Drama("Strong Woman Do Bong Soon", "Comédia", "Nascida com superforça, Bong Soon sonha em ser delicada. Entre pancadas e paixões, ela vira guarda-costas de um CEO e enfrenta vilões com charme e socos poderosos.", R.drawable.strong_woman),
            Drama("Welcome to Waikiki", "Comédia", "Três amigos atrapalhados tentam manter uma pensão decadente. Entre hóspedes inusitados e sonhos frustrados, vivem situações hilárias em busca de um futuro melhor.", R.drawable.waikiki),
            Drama("Meu Primeiro Amor", "Comédia", "Um jovem se vê dividido entre o presente e as doces memórias de sua infância. Quando seu primeiro amor reaparece, antigos sentimentos florescem com novas confusões.", R.drawable.meu_primeiro_amor),
            Drama("Proposta de Negócios", "Comédia", "Uma executiva finge ser outra pessoa em um encontro às cegas e acaba conhecendo seu chefe. O caos se instala entre contratos, disfarces e um amor que surpreende.", R.drawable.proposta_de_negocios),
            Drama("Sr Queen", "Comédia", "Um chef do século XXI acorda no corpo de uma rainha da era Joseon. Tentando sobreviver à corte, ele mistura etiqueta com gírias modernas, causando riso e escândalo.", R.drawable.sr_queen),
            Drama("Her Private Life", "Comédia", "De dia, ela é uma curadora séria. À noite, uma fangirl dedicada. Sua vida vira de cabeça para baixo quando seu chefe descobre seu segredo... e seu coração também.", R.drawable.her_private_life),
            Drama("Meu Amor das Estrelas", "Comédia", "Um alienígena que vive na Terra há séculos tenta manter-se distante dos humanos — até conhecer uma atriz extravagante. Entre estrelas e risadas, o amor floresce.", R.drawable.amor_das_estrelas),
            Drama("Oh My Venus", "Comédia", "Uma advogada em crise decide mudar de vida e corpo com a ajuda de um personal trainer famoso. No caminho da autoestima, risadas e um romance inesperado surgem.", R.drawable.oh_my_venus),
            Drama("Hate to Love You", "Comédia", "Dois rivais teimosos travam batalhas hilárias, mas descobrem que entre farpas e birras nasce uma paixão. Amar quem se odeia pode ser o jogo mais perigoso de todos.", R.drawable.hate_to_love_you),
            Drama("Limpe com Paixão", "Comédia", "Um empresário obcecado por limpeza conhece uma jovem despreocupada e caótica. Entre germes e gargalhadas, ele aprende que o amor nem sempre vem com luvas.", R.drawable.limpe_com_paixao),
            Drama("Médicos em Colapso", "Comédia", "Um grupo de médicos enfrenta o caos hospitalar e emocional. Entre plantões, gafes e romances confusos, descobrem que rir é, às vezes, o melhor remédio da alma.", R.drawable.medicos_em_colapso)
        )

        "Drama" -> listOf(
            Drama("It's Okay to Not Be Okay", "Drama", "Um cuidador dedicado e uma escritora excêntrica se encontram entre traumas e cicatrizes. Juntos, iniciam uma jornada de cura, enfrentando o passado com amor e empatia.", R.drawable.okay_not_okay),
            Drama("Hospital Playlist", "Drama", "Cinco médicos, amigos desde a faculdade, equilibram cirurgias e serenatas. Entre risos, perdas e afeto, mostram que a vida no hospital também pulsa com música e amizade.", R.drawable.hospital_playlist),
            Drama("The Good Bad Mother", "Drama", "Uma mãe rígida cria sozinha o filho para enfrentar o mundo. Após um acidente, ele volta à infância, e ela tem uma chance de amar com doçura. Um drama de perdão e renascimento.", R.drawable.good_bad_mother),
            Drama("When Life Gives You Tangerines", "Drama", "Em uma vila costeira, jovens vivem amores, perdas e sonhos. Entre laranjeiras e memórias, enfrentam as dores do crescimento com esperança e a beleza da simplicidade.", R.drawable.tangerines),
            Drama("Amanhã", "Drama", "Ceifadores trabalham para salvar almas em desespero. Numa missão entre a vida e a morte, tocam histórias humanas com empatia, mostrando que até o amanhã pode mudar.", R.drawable.tomorrow),
            Drama("At a Distance, Spring is Green", "Drama", "Na universidade, jovens enfrentam expectativas, solidão e o desejo de pertencimento. Entre amizades frágeis e amores nascente, a juventude floresce sob pressões invisíveis.", R.drawable.spring_is_green),
            Drama("Snowdrop", "Drama", "Em meio ao regime autoritário, uma jovem universitária esconde um fugitivo ferido. Um amor proibido floresce, cercado por traições e sacrifícios em tempos sombrios.", R.drawable.snowdrop),
            Drama("Navillera", "Drama", "Um senhor de idade sonha em dançar balé e encontra inspiração em um jovem talentoso. Unidos pela arte, desafiam o tempo e os preconceitos para dançar com a alma.", R.drawable.navillera),
            Drama("Rainha das Lágrimas", "Drama", "Um casal poderoso vê seu império emocional ruir. Em meio a crises e ressentimentos, descobrem que até corações congelados podem derreter sob lágrimas sinceras.", R.drawable.rainha_das_lagrimas),
            Drama("O Rei de Porcelana", "Drama", "Numa dinastia fictícia, intrigas palacianas e lutas por poder se desenrolam. O jovem rei tenta governar com justiça enquanto é ameaçado por forças internas e externas.", R.drawable.rei_porcelana),
            Drama("Quando o Telefone Toca", "Drama", "Chamadas misteriosas entrelaçam vidas de desconhecidos. Através de cada ligação, segredos vêm à tona, conectando passado, presente e destinos marcados pelo acaso.", R.drawable.telefone_toca),
            Drama("Vejo Você na Próxima Vida", "Drama", "Amores perdidos se reencontram vida após vida. Em cada existência, os protagonistas enfrentam escolhas e destinos, buscando, enfim, o reencontro definitivo.", R.drawable.proxima_vida),
            Drama("Trinta e Nove", "Drama", "Três amigas enfrentam a proximidade dos 40 com amor, perdas e recomeços. Entre taças de vinho e lágrimas contidas, redescobrem o valor da amizade e do tempo presente.", R.drawable.trinta_e_nove),
            Drama("Mr. Plankton", "Drama", "Nascido como ninguém, rejeitado por todos, um homem vaga pelo mundo em busca de pertencimento. Em sua jornada, descobre que até os invisíveis têm histórias para contar.", R.drawable.mr_plankton)
        )

        "Ficção" -> listOf(
            Drama("W: Two Worlds", "Ficção", "Uma cirurgiã é sugada para um webtoon onde realidade e ficção colidem. Entre tiros, mistérios e um herói desenhado, ela vive um amor impossível entre dois mundos.", R.drawable.two_worlds),
            Drama("Alice in Borderland", "Ficção", "Num Tóquio alternativo, jovens participam de jogos letais para sobreviver. A cada desafio, alianças e sacrifícios testam os limites da mente e da humanidade.", R.drawable.alice_borderland),
            Drama("O Mar da Tranquilidade", "Ficção", "Uma missão à Lua revela segredos sombrios em uma base abandonada. Entre silêncio e sangue, cientistas lutam pela verdade e por oxigênio em um futuro árido.", R.drawable.mar_tranquilidade),
            Drama("O Mito de Sísifo", "Ficção", "Um gênio da ciência descobre uma conspiração que desafia o tempo. Em meio a loops temporais, ele busca salvar a mulher amada e impedir um destino trágico.", R.drawable.mito_sisifo),
            Drama("Meu Amor Holo", "Ficção", "Solitária, ela encontra consolo em um holograma perfeito. Mas o que é real? Em um triângulo entre o homem, a máquina e o coração, nasce um amor além do físico.", R.drawable.meu_amor_holo),
            Drama("18 Outra Vez", "Ficção", "Após um desejo desesperado, um homem de meia-idade volta a ter 18 anos. Com nova aparência e velhas memórias, ele tenta reconquistar a família e a si mesmo.", R.drawable.dezoito_outra_vez),
            Drama("Ghost Doctor", "Ficção", "Um cirurgião arrogante sofre um acidente e seu espírito passa a habitar o corpo de um jovem médico. Juntos, enfrentam cirurgias, fantasmas e suas próprias feridas.", R.drawable.ghost_doctor),
            Drama("Chicago Typewriter", "Ficção", "Três almas ligadas por uma máquina de escrever revivem memórias de uma revolução passada. No presente, reencontram o amor, a dor e os segredos de outra vida.", R.drawable.chicago_typewriter),
            Drama("Hey Ghost, Let's Fight", "Ficção", "Um universitário com o dom de ver espíritos ganha a vida exorcizando fantasmas. Ao conhecer o espírito de uma estudante, descobre que o amor pode ser imortal.", R.drawable.hey_ghost),
            Drama("Hello, Me!", "Ficção", "Cansada da vida, uma mulher reencontra sua versão jovem e cheia de sonhos. Entre risos e lágrimas, ela redescobre sua essência e a beleza de recomeçar.", R.drawable.hello_me),
            Drama("A Esposa do Meu Marido", "Ficção", "Após ser traída e assassinada, uma mulher retorna ao passado. Com o tempo como aliado, ela planeja vingança e uma nova chance para mudar seu destino cruel.", R.drawable.esposa_meu_marido),
            Drama("Black", "Ficção", "Um ceifador assume o corpo de um detetive para capturar almas fugitivas. Mas ao se apaixonar por uma humana, começa a desafiar as leis do céu e do inferno.", R.drawable.black),
            Drama("Memórias de Alhambra", "Ficção", "Um jogo de realidade aumentada mistura fantasia e perigo real. Um CEO é arrastado por bugs letais e conspirações enquanto busca o criador do enigmático jogo.", R.drawable.alhambra)
        )

        "Terror" -> listOf(
            Drama("Sweet Home", "Terror", "Quando um vírus transforma desejos humanos em monstros, moradores de um prédio isolado lutam pela sobrevivência. O apocalipse revela o pior — e o melhor — da alma humana.", R.drawable.sweet_home),
            Drama("All of Us Are Dead", "Terror", "Em uma escola infestada por zumbis, alunos enfrentam o terror da morte e da solidão. Entre sangue e esperança, tentam resistir em meio ao colapso do mundo que conheciam.", R.drawable.all_of_us_are_dead),
            Drama("Light Shop", "Terror", "Clientes que cruzam as portas de uma loja misteriosa têm suas vidas transformadas para sempre. Cada objeto vendido carrega uma escolha sombria — e um preço oculto.", R.drawable.light_shop),
            Drama("Sell Your Haunted House", "Terror", "Uma exorcista do mercado imobiliário enfrenta fantasmas e traumas ao vender casas assombradas. Entre gritos do além e histórias inacabadas, ela busca sua própria redenção.", R.drawable.sell_haunted_house),
            Drama("Goedam", "Terror", "Curtos e arrepiantes contos urbanos exploram o medo cotidiano. Em vielas, escolas e elevadores, o terror espreita — às vezes invisível, sempre inevitável.", R.drawable.goedam),
            Drama("A Criatura de Gyeongseong", "Terror", "Durante a ocupação japonesa, criaturas horrendas nascem de experimentos secretos. Em becos sombrios, heróis improváveis enfrentam o horror para proteger o que resta da humanidade.", R.drawable.gyeongseong_creature),
            Drama("Profecia do Inferno", "Terror", "Aparecem criaturas que anunciam o dia da morte das pessoas, levando-as brutalmente ao inferno. A fé e o medo colidem enquanto o mundo tenta entender a justiça divina.", R.drawable.profecia_inferno),
            Drama("Parasyte: The Grey", "Terror", "Parasitas alienígenas tomam corpos humanos e se escondem entre nós. Em uma luta silenciosa pela sobrevivência, poucos ousam enfrentar a ameaça que corrói a humanidade.", R.drawable.parasyte_grey),
            Drama("Kingdom", "Terror", "Na Coreia feudal, uma praga zumbi se espalha pela corte e pelos vilarejos. Entre guerras políticas e horrores carnívoros, um príncipe luta para salvar o reino e a verdade.", R.drawable.kingdom),
            Drama("Somebody", "Terror", "Um aplicativo de encontros conecta almas... e assassinos. Entre crimes brutais e relações perturbadoras, uma desenvolvedora enfrenta a escuridão que ajudou a criar.", R.drawable.somebody)
        )

        "Romance" -> listOf(
            Drama("Crash Landing on You", "Romance", "Uma herdeira sul-coreana cai de paraquedas na Coreia do Norte e conhece um oficial. Em terras inimigas, nasce um amor proibido que desafia fronteiras e corações.", R.drawable.crash_landing),
            Drama("True Beauty", "Romance", "Uma jovem insegura usa maquiagem para esconder seu rosto e enfrentar o colégio. Mas o verdadeiro amor surgirá quando ela encarar sua essência sem máscaras.", R.drawable.true_beauty),
            Drama("What's Wrong with Secretary Kim", "Romance", "Um CEO vaidoso vê seu mundo ruir quando sua secretária decide pedir demissão. Entre lembranças do passado e declarações desajeitadas, nasce um amor encantador.", R.drawable.secretary_kim),
            Drama("Touch Your Heart", "Romance", "Uma atriz em decadência finge ser secretária para se preparar para um papel. Em um escritório de advocacia, ela encontra um advogado frio... e o calor do amor.", R.drawable.touch_your_heart),
            Drama("Hometown Cha-Cha-Cha", "Romance", "Uma dentista da cidade grande se muda para uma vila litorânea e conhece um faz-tudo gentil. Entre sorrisos e ondas, nasce um romance doce e cheio de afeto.", R.drawable.hometown_cha_cha_cha),
            Drama("Sorriso Real", "Romance", "Dois corações feridos se encontram em um hotel luxuoso. Entre mágoas e sorrisos sinceros, floresce um amor inesperado que traz cura, esperança e recomeço.", R.drawable.sorriso_real),
            Drama("Intensivão de Amor", "Romance", "Uma mãe dedicada e um professor gênio se cruzam em meio à pressão dos estudos. Em meio a provas e corações acelerados, nasce um amor que desafia padrões.", R.drawable.intensivao_amor),
            Drama("De Volta às Raízes", "Romance", "Ao retornar para sua cidade natal, uma mulher reencontra antigas amizades e um velho amor. Entre memórias e redescobertas, ela aprende que o amor floresce duas vezes.", R.drawable.volta_raizes),
            Drama("O Amor Mora ao Lado", "Romance", "Em um condomínio tranquilo, vizinhos com vidas distintas descobrem que o destino mora ao lado. Pequenos gestos constroem grandes sentimentos em silêncio.", R.drawable.amor_ao_lado),
            Drama("Romance is a Bonus Book", "Romance", "Uma talentosa editora recomeça a vida trabalhando com seu amigo de infância. Entre páginas e segredos, eles descobrem que o amor também é uma bela história.", R.drawable.bonus_book),
            Drama("Na Direção do Amor", "Romance", "Dois estranhos com passados difíceis têm seus caminhos entrelaçados por coincidências. Em meio a encontros inesperados, aprendem a caminhar juntos rumo ao amor.", R.drawable.direcao_amor),
            Drama("A Love So Beautiful", "Romance", "Uma garota alegre e um colega reservado compartilham os altos e baixos da juventude. Em olhares tímidos e gestos sinceros, nasce o doce primeiro amor.", R.drawable.love_so_beautiful),
            Drama("Nosso Eterno Verão", "Romance", "Ex-namorados se reencontram anos depois para gravar um documentário. Velhos sentimentos vêm à tona em meio ao calor do verão e à beleza de recomeçar.", R.drawable.eterno_verao),
            Drama("Um Amor de Cinema", "Romance", "Dois apaixonados por filmes se encontram em uma sala de cinema e vivem um roteiro próprio. Entre cenas clássicas e beijos roubados, nasce um amor cinematográfico.", R.drawable.amor_de_cinema)
        )

        "Fantasia" -> listOf(
            Drama("Meu Demônio Favorito", "Fantasia", "Uma humana encontra um demônio irresistível que perde seus poderes ao tocá-la. Entre conflitos celestiais e desejos terrenos, nasce um amor capaz de desafiar o inferno.", R.drawable.meu_demonio),
            Drama("O Tempo Traz Você pra Mim", "Fantasia", "Dois corações separados por décadas se conectam através do tempo. Em cada carta e encontro improvável, um destino escrito entre passado e futuro se revela.", R.drawable.tempo_traz_voce),
            Drama("O Abismo Mágico", "Fantasia", "Um misterioso abismo concede nova aparência a quem nele cai. Entre segredos e recomeços, duas almas tentam desvendar a verdade e encontrar o amor real.", R.drawable.abismo_magico),
            Drama("Oh My Ghost", "Fantasia", "Uma tímida chef é possuída por um espírito atrevido e sedento por amor. Juntas, elas embarcam em uma jornada de redenção, receitas e corações acelerados.", R.drawable.oh_my_ghost),
            Drama("Hotel del Luna", "Fantasia", "Um hotel luxuoso abriga almas perdidas antes do além. Sua gerente imortal, presa ao passado, vê sua vida mudar com a chegada de um novo gerente humano.", R.drawable.hotel_del_luna),
            Drama("Jogo da Morte", "Fantasia", "Após morrer, um homem é desafiado por uma entidade a viver diversas vidas. Em cada renascimento, ele tenta mudar o destino, em um jogo entre culpa e salvação.", R.drawable.jogo_da_morte),
            Drama("The Uncanny Counter", "Fantasia", "Quatro caçadores de espíritos malignos trabalham disfarçados em um restaurante. Dotados de poderes únicos, enfrentam forças sombrias que ameaçam o mundo.", R.drawable.uncanny_counter),
            Drama("My Roommate Is a Gumiho", "Fantasia", "Uma estudante acidentalmente engole uma conta mágica de uma raposa mística. Agora, dividem o lar e o destino, enquanto aprendem sobre amor e humanidade.", R.drawable.roommate_gumiho)
        )

        "Thriller" -> listOf(
            Drama("Strangers from Hell", "Thriller", "Ao se mudar para um edifício estranho, um jovem vê sua sanidade ruir. Cercado por vizinhos perturbadores, ele mergulha em um pesadelo urbano sem volta.", R.drawable.strangers_from_hell),
            Drama("Signal", "Thriller", "Um detetive do presente encontra um velho rádio que o conecta a um policial do passado. Juntos, resolvem crimes esquecidos, desafiando o tempo e o destino.", R.drawable.signal),
            Drama("Beyond Evil", "Thriller", "Dois policiais com passados sombrios unem forças para capturar um serial killer. Mas até onde pode ir a verdade, quando os monstros estão tão perto?", R.drawable.beyond_evil),
            Drama("Voice", "Thriller", "Com uma audição excepcional, uma policial rastreia criminosos pelo som. Ao lado de um detetive impulsivo, corre contra o tempo para salvar vidas.", R.drawable.voice),
            Drama("Save Me", "Thriller", "Uma jovem presa em uma seita grita por socorro com os olhos. Um grupo de ex-colegas decide enfrentar o fanatismo e a manipulação para salvá-la.", R.drawable.save_me),
            Drama("Watcher", "Thriller", "Após eventos traumáticos, três pessoas investigam corrupção policial. Em uma rede de mentiras e vigilância, buscam justiça e enfrentam seus próprios demônios.", R.drawable.watcher),
            Drama("The Guest", "Thriller", "Um xamã, um padre e uma detetive enfrentam forças sobrenaturais que se alimentam da dor humana. Em cada caso, uma batalha espiritual contra o mal interior.", R.drawable.the_guest),
            Drama("D.P.", "Thriller", "Um jovem soldado é recrutado para capturar desertores do exército. Nessa missão, descobre os horrores ocultos e a dura realidade da hierarquia militar.", R.drawable.dp)
        )

        else -> listOf()
    }

    return dramas.random()
}
