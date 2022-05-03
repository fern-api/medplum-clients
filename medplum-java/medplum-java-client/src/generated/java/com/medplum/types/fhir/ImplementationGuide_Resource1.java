package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImplementationGuide_Resource1.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Resource1 {
  Optional<List<Extension>> extension();

  Reference reference();

  Optional<String> exampleCanonical();

  Optional<Url> relativePath();

  Optional<Boolean> exampleBoolean();

  Optional<String> id();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImplementationGuide_Resource1.ReferenceBuildStage builder() {
    return ImmutableImplementationGuide_Resource1.builder();
  }
}
