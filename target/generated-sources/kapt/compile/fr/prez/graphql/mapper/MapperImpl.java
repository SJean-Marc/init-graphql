package fr.prez.graphql.mapper;

import fr.prez.graphql.domain.Batiment;
import fr.prez.graphql.dto.BatimentQl;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-28T15:26:22+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.5 (JetBrains s.r.o)"
)
public class MapperImpl implements Mapper {

    @Override
    public BatimentQl toBatimentQl(Batiment batiment) {
        if ( batiment == null ) {
            return null;
        }

        BatimentQl batimentQl = new BatimentQl();

        batimentQl.setId( batiment.getId() );
        batimentQl.setRef( batiment.getRef() );

        return batimentQl;
    }
}
