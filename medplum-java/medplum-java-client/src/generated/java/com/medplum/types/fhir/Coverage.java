package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCoverage.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface Coverage {
  Optional<List<Coverage_CostToBeneficiary>> costToBeneficiary();

  List<Reference> payor();

  Optional<String> dependent();

  Optional<String> subscriberId();

  Optional<String> network();

  Optional<Narrative> text();

  Optional<PositiveInt> order();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> extension();

  String resourceType();

  Optional<Id> id();

  Optional<Code> language();

  Optional<CodeableConcept> relationship();

  Optional<Reference> policyHolder();

  Optional<List<ResourceList>> contained();

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> type();

  Optional<Code> status();

  Optional<Period> period();

  Optional<Meta> meta();

  Reference beneficiary();

  Optional<List<Identifier>> identifier();

  @JsonProperty("class")
  Optional<List<Coverage_Class>> _class();

  Optional<Boolean> subrogation();

  Optional<Reference> subscriber();

  Optional<List<Reference>> contract();

  static ImmutableCoverage.ResourceTypeBuildStage builder() {
    return ImmutableCoverage.builder();
  }
}
