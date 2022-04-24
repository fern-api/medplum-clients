package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<java.util.List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<CodeableConcept> code();

  Optional<Reference> encounter();

  String resourceType();

  Optional<java.util.List<Identifier>> identifier();

  Optional<id> id();

  Optional<Reference> subject();

  Optional<Reference> source();

  Optional<CodeableConcept> orderedBy();

  Optional<CodeableConcept> emptyReason();

  Optional<java.util.List<List_Entry>> entry();

  Optional<ListMode> mode();

  Optional<String> title();

  Optional<dateTime> date();

  Optional<java.util.List<Extension>> extension();

  Optional<code> language();

  Optional<ListStatus> status();

  Optional<java.util.List<Annotation>> note();

  Optional<Meta> meta();

  Optional<java.util.List<ResourceList>> contained();

  Optional<uri> implicitRules();

  static ImmutableList.ResourceTypeBuildStage builder() {
    return ImmutableList.builder();
  }
}
