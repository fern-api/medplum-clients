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
  Optional<String> participantEffectiveDescription();

  Optional<String> definitionCanonical();

  Optional<Boolean> exclude();

  Optional<String> studyEffectiveDescription();

  Optional<Duration> studyEffectiveDuration();

  Optional<Period> participantEffectivePeriod();

  Optional<List<Extension>> extension();

  Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure(
      );

  Optional<Timing> participantEffectiveTiming();

  Optional<String> studyEffectiveDateTime();

  Optional<Duration> participantEffectiveDuration();

  Optional<Duration> studyEffectiveTimeFromStart();

  Optional<Expression> definitionExpression();

  Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure(
      );

  Optional<List<Extension>> modifierExtension();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<Period> studyEffectivePeriod();

  Optional<Duration> participantEffectiveTimeFromStart();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<String> id();

  Optional<String> participantEffectiveDateTime();

  Optional<List<UsageContext>> usageContext();

  Optional<Timing> studyEffectiveTiming();

  Optional<CodeableConcept> unitOfMeasure();

  static ImmutableResearchElementDefinition_Characteristic.Builder builder() {
    return ImmutableResearchElementDefinition_Characteristic.builder();
  }
}
