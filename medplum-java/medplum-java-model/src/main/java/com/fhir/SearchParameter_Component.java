package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSearchParameter_Component.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SearchParameter_Component {
  Optional<String> expression();

  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  canonical definition();

  static ImmutableSearchParameter_Component.DefinitionBuildStage builder() {
    return ImmutableSearchParameter_Component.builder();
  }
}
