package com.esrx.services.drugstore.mapper;

import org.springframework.stereotype.Component;

import com.esrx.services.drugstore.domain.CreateRequest;
import com.esrx.services.drugstore.domain.CreateResponse;
import com.esrx.services.drugstore.domain.GetResponse;
import com.esrx.services.drugstore.domain.UpdateRequest;
import com.esrx.services.drugstore.domain.UpdateResponse;
import com.esrx.services.drugstore.model.Drug;

import ma.glasnost.orika.MapperFactory;
import net.rakugakibox.spring.boot.orika.OrikaMapperFactoryConfigurer;

@Component
public class DrugMapping implements OrikaMapperFactoryConfigurer {
	
	@Override
	public void configure(MapperFactory orikaMapperFactory) {
		orikaMapperFactory.classMap(Drug.class, GetResponse.class).mapNulls(false).byDefault()
					.register();
		orikaMapperFactory.classMap(Drug.class, UpdateResponse.class).mapNulls(false).byDefault()
					.register();
		orikaMapperFactory.classMap(Drug.class, CreateResponse.class).mapNulls(false).byDefault()
					.register();
		orikaMapperFactory.classMap(GetResponse.class, Drug.class).mapNulls(false).byDefault()
					.register();
		orikaMapperFactory.classMap(CreateRequest.class, Drug.class).mapNulls(false).byDefault()
					.register();
		orikaMapperFactory.classMap(UpdateRequest.class, Drug.class).mapNulls(false).byDefault()
					.register();
		orikaMapperFactory.classMap(UpdateRequest.class, GetResponse.class).mapNulls(false).byDefault()
					.register();
		
	}
}
