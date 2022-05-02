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
  Optional<List<Extension>> extension();

  Optional<List<SubstancePolymer_MonomerSet>> monomerSet();

  Optional<Uri> implicitRules();

  Optional<List<String>> modification();

  @JsonProperty("class")
  Optional<CodeableConcept> _class();

  Optional<Meta> meta();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<CodeableConcept> geometry();

  String resourceType();

  Optional<List<Extension>> modifierExtension();

  Optional<Narrative> text();

  Optional<List<SubstancePolymer_Repeat>> repeat();

  Optional<List<CodeableConcept>> copolymerConnectivity();

  Optional<Code> language();

  static ImmutableSubstancePolymer.ResourceTypeBuildStage builder() {
    return ImmutableSubstancePolymer.builder();
  }
}
