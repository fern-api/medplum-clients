package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableProvenance.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Provenance {
  Optional<List<Provenance_Entity>> entity();

  String resourceType();

  Optional<instant> recorded();

  Optional<String> occurredDateTime();

  Optional<List<CodeableConcept>> reason();

  List<Reference> target();

  Optional<code> language();

  List<Provenance_Agent> agent();

  Optional<Reference> location();

  Optional<List<uri>> policy();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Extension>> extension();

  Optional<List<Signature>> signature();

  Optional<Period> occurredPeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<id> id();

  Optional<Meta> meta();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> activity();

  static ImmutableProvenance.ResourceTypeBuildStage builder() {
    return ImmutableProvenance.builder();
  }
}
