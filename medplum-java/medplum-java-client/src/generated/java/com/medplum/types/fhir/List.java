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
  Optional<Code> language();

  Optional<CodeableConcept> code();

  Optional<java.util.List<Extension>> modifierExtension();

  Optional<java.util.List<Annotation>> note();

  Optional<ListStatus> status();

  Optional<CodeableConcept> emptyReason();

  Optional<Uri> implicitRules();

  Optional<Id> id();

  Optional<Meta> meta();

  Optional<CodeableConcept> orderedBy();

  Optional<String> title();

  Optional<java.util.List<Extension>> extension();

  String resourceType();

  Optional<Reference> source();

  Optional<java.util.List<ResourceList>> contained();

  Optional<java.util.List<List_Entry>> entry();

  Optional<Reference> subject();

  Optional<ListMode> mode();

  Optional<DateTime> date();

  Optional<Narrative> text();

  Optional<java.util.List<Identifier>> identifier();

  Optional<Reference> encounter();

  static ImmutableList.ResourceTypeBuildStage builder() {
    return ImmutableList.builder();
  }
}
