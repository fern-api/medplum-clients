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
    as = ImmutableImplementationGuide_Manifest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Manifest {
  Optional<List<Extension>> extension();

  Optional<url> rendering();

  Optional<List<ImplementationGuide_Page1>> page();

  List<ImplementationGuide_Resource1> resource();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<String>> other();

  Optional<List<String>> image();

  static ImmutableImplementationGuide_Manifest.Builder builder() {
    return ImmutableImplementationGuide_Manifest.builder();
  }
}
