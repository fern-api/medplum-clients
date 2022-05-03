package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<String> expression();

  Canonical definition();

  static ImmutableSearchParameter_Component.DefinitionBuildStage builder() {
    return ImmutableSearchParameter_Component.builder();
  }
}
