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
  Optional<Meta> meta();

  Optional<Uri> implicitRules();

  Optional<String> title();

  Optional<java.util.List<ResourceList>> contained();

  Optional<ListMode> mode();

  Optional<Reference> encounter();

  Optional<ListStatus> status();

  String resourceType();

  Optional<java.util.List<Extension>> extension();

  Optional<java.util.List<Extension>> modifierExtension();

  Optional<java.util.List<Identifier>> identifier();

  Optional<Reference> subject();

  Optional<CodeableConcept> orderedBy();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<DateTime> date();

  Optional<CodeableConcept> emptyReason();

  Optional<Reference> source();

  Optional<Code> language();

  Optional<java.util.List<Annotation>> note();

  Optional<java.util.List<List_Entry>> entry();

  Optional<CodeableConcept> code();

  static ImmutableList.ResourceTypeBuildStage builder() {
    return ImmutableList.builder();
  }
}
