package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
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
  Optional<Id> id();

  Optional<List<String>> modification();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Meta> meta();

  Optional<CodeableConcept> geometry();

  Optional<List<SubstancePolymer_Repeat>> repeat();

  Optional<Code> language();

  @JsonProperty("class")
  Optional<CodeableConcept> _class();

  String resourceType();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> copolymerConnectivity();

  Optional<Uri> implicitRules();

  Optional<List<SubstancePolymer_MonomerSet>> monomerSet();

  Optional<List<ResourceList>> contained();

  static ImmutableSubstancePolymer.ResourceTypeBuildStage builder() {
    return ImmutableSubstancePolymer.builder();
  }
}
