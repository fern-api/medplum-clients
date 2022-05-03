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
  Optional<Uri> implicitRules();

  String resourceType();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<Meta> meta();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  @JsonProperty("class")
  Optional<CodeableConcept> _class();

  Optional<List<SubstancePolymer_MonomerSet>> monomerSet();

  Optional<Code> language();

  Optional<CodeableConcept> geometry();

  Optional<List<String>> modification();

  Optional<Narrative> text();

  Optional<List<CodeableConcept>> copolymerConnectivity();

  Optional<List<SubstancePolymer_Repeat>> repeat();

  static ImmutableSubstancePolymer.ResourceTypeBuildStage builder() {
    return ImmutableSubstancePolymer.builder();
  }
}
