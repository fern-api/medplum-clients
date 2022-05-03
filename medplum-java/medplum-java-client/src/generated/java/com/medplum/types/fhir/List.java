package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableList.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface List {
  Optional<CodeableConcept> orderedBy();

  String resourceType();

  Optional<Reference> source();

  Optional<Reference> encounter();

  Optional<java.util.List<ResourceList>> contained();

  Optional<String> title();

  Optional<java.util.List<List_Entry>> entry();

  Optional<java.util.List<Identifier>> identifier();

  Optional<CodeableConcept> emptyReason();

  Optional<DateTime> date();

  Optional<java.util.List<Extension>> extension();

  Optional<Code> language();

  Optional<Narrative> text();

  Optional<Meta> meta();

  Optional<java.util.List<Extension>> modifierExtension();

  Optional<Reference> subject();

  Optional<Uri> implicitRules();

  Optional<ListMode> mode();

  Optional<Id> id();

  Optional<ListStatus> status();

  Optional<CodeableConcept> code();

  Optional<java.util.List<Annotation>> note();

  static ImmutableList.ResourceTypeBuildStage builder() {
    return ImmutableList.builder();
  }
}
