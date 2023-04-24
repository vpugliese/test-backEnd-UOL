package mapper;

import dto.PlayerDTO;
import model.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    PlayerDTO toPlayerDTO(PlayerEntity player);

    List<PlayerDTO> listPlayerDTO(List<PlayerEntity> playerEntities);

    PlayerEntity toPlayer(PlayerDTO playerDTO);


}
