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
    as = ImmutableImplementationGuide_Manifest.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Manifest {
  Optional<List<Extension>> modifierExtension();

  Optional<Url> rendering();

  Optional<List<String>> image();

  Optional<List<String>> other();

  Optional<List<Extension>> extension();

  List<ImplementationGuide_Resource1> resource();

  Optional<String> id();

  Optional<List<ImplementationGuide_Page1>> page();

  static ImmutableImplementationGuide_Manifest.Builder builder() {
    return ImmutableImplementationGuide_Manifest.builder();
  }
}
