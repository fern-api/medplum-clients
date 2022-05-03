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
  Optional<String> exampleCanonical();

  Optional<String> description();

  Optional<String> name();

  Optional<String> id();

  Optional<List<Implementationguide_resourceFhirversionItem>> fhirVersion();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Id> groupingId();

  Reference reference();

  Optional<Boolean> exampleBoolean();

  static ImmutableImplementationGuide_Resource.ReferenceBuildStage builder() {
    return ImmutableImplementationGuide_Resource.builder();
  }
}
