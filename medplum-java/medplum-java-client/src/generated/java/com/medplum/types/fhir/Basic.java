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
  Optional<List<ResourceList>> contained();

  Optional<Reference> author();

  CodeableConcept code();

  Optional<Date> created();

  Optional<Reference> subject();

  Optional<Code> language();

  Optional<Id> id();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Identifier>> identifier();

  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<Narrative> text();

  static ImmutableBasic.CodeBuildStage builder() {
    return ImmutableBasic.builder();
  }
}
