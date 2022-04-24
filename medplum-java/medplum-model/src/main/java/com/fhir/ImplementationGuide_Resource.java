package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableImplementationGuide_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Resource {
  Optional<String> name();

  Reference reference();

  Optional<id> groupingId();

  Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion();

  Optional<String> exampleCanonical();

  Optional<String> id();

  Optional<String> description();

  Optional<List<Extension>> extension();

  Optional<Boolean> exampleBoolean();

  Optional<List<Extension>> modifierExtension();

  static ImmutableImplementationGuide_Resource.ReferenceBuildStage builder() {
    return ImmutableImplementationGuide_Resource.builder();
  }
}
