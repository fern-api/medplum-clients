package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    as = ImmutableResearchElementDefinition_Characteristic.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface ResearchElementDefinition_Characteristic {
  Optional<List<Extension>> extension();

  Optional<CodeableConcept> unitOfMeasure();

  Optional<String> id();

  Optional<Duration> studyEffectiveTimeFromStart();

  Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure(
      );

  Optional<Boolean> exclude();

  Optional<String> definitionCanonical();

  Optional<List<UsageContext>> usageContext();

  Optional<Timing> participantEffectiveTiming();

  Optional<String> studyEffectiveDateTime();

  Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure(
      );

  Optional<Timing> studyEffectiveTiming();

  Optional<Duration> participantEffectiveDuration();

  Optional<String> studyEffectiveDescription();

  Optional<String> participantEffectiveDescription();

  Optional<Duration> participantEffectiveTimeFromStart();

  Optional<Expression> definitionExpression();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<String> participantEffectiveDateTime();

  Optional<Period> participantEffectivePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Period> studyEffectivePeriod();

  Optional<Duration> studyEffectiveDuration();

  static ImmutableResearchElementDefinition_Characteristic.Builder builder() {
    return ImmutableResearchElementDefinition_Characteristic.builder();
  }
}
