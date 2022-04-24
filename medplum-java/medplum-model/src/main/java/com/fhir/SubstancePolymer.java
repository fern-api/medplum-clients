package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableSubstancePolymer.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface SubstancePolymer {
  Optional<id> id();

  Optional<List<String>> modification();

  Optional<List<Extension>> extension();

  Optional<code> language();

  Optional<List<SubstancePolymer_MonomerSet>> monomerSet();

  Optional<List<SubstancePolymer_Repeat>> repeat();

  @JsonProperty("class")
  Optional<CodeableConcept> _class();

  Optional<List<ResourceList>> contained();

  Optional<List<CodeableConcept>> copolymerConnectivity();

  Optional<Meta> meta();

  String resourceType();

  Optional<uri> implicitRules();

  Optional<Narrative> text();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> geometry();

  static ImmutableSubstancePolymer.ResourceTypeBuildStage builder() {
    return ImmutableSubstancePolymer.builder();
  }
}
