package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableResearchElementDefinition_Characteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchElementDefinition_Characteristic {
  Optional<Duration> studyEffectiveTimeFromStart();

  Optional<Period> participantEffectivePeriod();

  Optional<Period> studyEffectivePeriod();

  Optional<List<UsageContext>> usageContext();

  Optional<List<Extension>> modifierExtension();

  Optional<Duration> participantEffectiveTimeFromStart();

  Optional<Duration> studyEffectiveDuration();

  Optional<String> studyEffectiveDescription();

  Optional<String> definitionCanonical();

  Optional<Timing> participantEffectiveTiming();

  Optional<List<Extension>> extension();

  Optional<String> studyEffectiveDateTime();

  Optional<Duration> participantEffectiveDuration();

  Optional<Boolean> exclude();

  Optional<String> id();

  Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure(
      );

  Optional<CodeableConcept> unitOfMeasure();

  Optional<Timing> studyEffectiveTiming();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure(
      );

  Optional<Expression> definitionExpression();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<String> participantEffectiveDescription();

  Optional<String> participantEffectiveDateTime();

  static ImmutableResearchElementDefinition_Characteristic.Builder builder() {
    return ImmutableResearchElementDefinition_Characteristic.builder();
  }
}
