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
    as = ImmutableImplementationGuide_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ImplementationGuide_Resource {
  Optional<List<Extension>> extension();

  Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion();

  Optional<Boolean> exampleBoolean();

  Optional<List<Extension>> modifierExtension();

  Reference reference();

  Optional<String> name();

  Optional<String> description();

  Optional<String> id();

  Optional<String> exampleCanonical();

  Optional<Id> groupingId();

  static ImmutableImplementationGuide_Resource.ReferenceBuildStage builder() {
    return ImmutableImplementationGuide_Resource.builder();
  }
}
