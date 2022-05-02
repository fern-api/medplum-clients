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
  Optional<java.util.List<Extension>> extension();

  Optional<java.util.List<Extension>> modifierExtension();

  Optional<DateTime> date();

  Optional<java.util.List<List_Entry>> entry();

  Optional<Meta> meta();

  Optional<java.util.List<ResourceList>> contained();

  String resourceType();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<java.util.List<Annotation>> note();

  Optional<Reference> subject();

  Optional<String> title();

  Optional<java.util.List<Identifier>> identifier();

  Optional<Reference> encounter();

  Optional<Id> id();

  Optional<CodeableConcept> orderedBy();

  Optional<Reference> source();

  Optional<Uri> implicitRules();

  Optional<CodeableConcept> emptyReason();

  Optional<ListStatus> status();

  Optional<ListMode> mode();

  Optional<Code> language();

  static ImmutableList.ResourceTypeBuildStage builder() {
    return ImmutableList.builder();
  }
}
