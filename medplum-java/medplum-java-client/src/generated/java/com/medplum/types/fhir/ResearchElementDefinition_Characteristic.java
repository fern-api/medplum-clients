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

  Optional<String> participantEffectiveDateTime();

  Optional<Duration> participantEffectiveDuration();

  Optional<String> studyEffectiveDateTime();

  Optional<Expression> definitionExpression();

  Optional<Duration> participantEffectiveTimeFromStart();

  Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure(
      );

  Optional<List<UsageContext>> usageContext();

  Optional<Timing> studyEffectiveTiming();

  Optional<Timing> participantEffectiveTiming();

  Optional<String> id();

  Optional<String> participantEffectiveDescription();

  Optional<Period> participantEffectivePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<String> definitionCanonical();

  Optional<String> studyEffectiveDescription();

  Optional<CodeableConcept> unitOfMeasure();

  Optional<Duration> studyEffectiveTimeFromStart();

  Optional<Period> studyEffectivePeriod();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<Boolean> exclude();

  Optional<Duration> studyEffectiveDuration();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure(
      );

  static ImmutableResearchElementDefinition_Characteristic.Builder builder() {
    return ImmutableResearchElementDefinition_Characteristic.builder();
  }
}
