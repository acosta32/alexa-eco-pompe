package io.github.pyvesb.alexaecopompe.speech;

public enum Messages {;

	public static final String NAME = "Éco Pompe";
	public static final String CARD_HELP = "Exemples:\n\"le sans plomb 98 à Lyon\"\n\"le gazole dans la Creuse\"\n\"l'E10 à moins de 10 kilomètres\"\nCarburants: gazole, sans plomb 95, sans plomb 98, E10, E85 ou GPL.";
	public static final String LAUNCH = "Demandez-moi la pompe la moins chère dans une ville, un département ou près de vous. Pour plus d'informations, dîtes \"aide\".";
	public static final String HELP = "Spécifiez un carburant suivi d'une ville, d'un département ou d'une distance. Par exemple : \"le sans plomb 98 à Lyon\", \"le gazole dans la Creuse\", ou \"l'E10 à moins de 10 kilomètres\".";
	public static final String CANCEL_STOP = "À bientôt sur Éco Pompe !";
	public static final String STATION_FOUND = "$NAME vend $TYPE pour $PRICE. $SUBJECT est située $ADDRESS à $TOWN, et a actualisé ses tarifs $DATE.";
	public static final String STATION_FOUND_E10 = "Je n'ai pas trouvé de pompe vendant du sans plomb 95. Cependant, $NAME vend de l'E10 pour $PRICE. $SUBJECT est située $ADDRESS à $TOWN, et a actualisé ses tarifs $DATE.";
	public static final String NO_STATION_TOWN = "Je n'ai pas trouvé de pompe dans $LOCATION. Essayez une ville différente.";
	public static final String NO_STATION_RADIUS = "Je n'ai pas trouvé de pompe à moins de $RADIUS kilomètres. Réessayez avec une distance plus grande. Par exemple, dîtes simplement : \"le $TYPE à moins de $BIGGER_RADIUS kilomètres\".";
	public static final String NO_STATION_RADIUS_MAX = "Je n'ai pas trouvé de pompe à moins de $RADIUS kilomètres. Veuillez préciser un nom de ville ou de département.";
	public static final String NO_STATION_FOR_TYPE_TOWN = "Je n'ai pas trouvé de pompe vendant $TYPE dans $LOCATION. Essayez un autre carburant ou une ville différente.";
	public static final String NO_STATION_FOR_TYPE_RADIUS = "Je n'ai pas trouvé de pompe vendant $TYPE à moins de $RADIUS kilomètres. Essayez un autre carburant ou une distance plus grande.";
	public static final String UNSUPPORTED_GAS_TYPE = "Je n'ai pas compris le carburant demandé. Réessayez en spécifiant gazole, sans plomb 95, sans plomb 98, E10, E85 ou GPL. Par exemple, dîtes simplement : \"le gazole à Bordeaux\".";
	public static final String UNSUPPORTED_LOCATION = "Je n'ai pas trouvé d'informations pour cette localisation géographique. Réessayez en énonçant clairement le nom de ville ou de département, ou bien spécifiez un lieu différent.";
	public static final String INCORRECT_RADIUS = "Veuillez fournir une distance comprise entre 1 et 50 kilomètres. Par exemple : \"le sans plomb 95 à moins de 10 kilomètres\".";
	public static final String MISSING_ADDRESS_PERMS = "J'ai besoin de votre adresse pour trouver les pompes à proximité. Veuillez autoriser l'accès dans l'application Alexa, ou bien précisez un nom de ville ou de département.";
	public static final String MISSING_ADDRESS_PERMS_NO_GEO = "Votre appareil n'a pas transmis de coordonnées GPS. Le service de localisation est-il activé ? Je peux également utiliser votre adresse pour trouver les pompes à proximité. Veuillez autorisez l'accès dans l'application Alexa, ou bien précisez un nom de ville ou de département.";
	public static final String MISSING_GEO_PERMS = "J'ai besoin de votre position géographique pour trouver les pompes à proximité. Veuillez autoriser l'accès dans l'application Alexa, ou bien précisez un nom de ville ou de département.";
	public static final String ADDRESS_ERROR = "Alexa a retourné une erreur. Réessayez plus tard, ou bien précisez un nom de ville ou de département.";
	public static final String POSITION_UNKNOWN = "Je n'ai pas réussi à déterminer votre position géographique avec l'adresse renseignée dans votre Amazon Echo. Réessayez plus tard, ou bien précisez un nom de ville ou de département.";

}
