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
    as = ImmutableBasic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Basic {
  Optional<List<Identifier>> identifier();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Reference> author();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<Reference> subject();

  CodeableConcept code();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<Date> created();

  static ImmutableBasic.ResourceTypeBuildStage builder() {
    return ImmutableBasic.builder();
  }
}
