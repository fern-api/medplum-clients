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
  Optional<String> studyEffectiveDescription();

  Optional<String> participantEffectiveDateTime();

  Optional<Timing> studyEffectiveTiming();

  Optional<Boolean> exclude();

  Optional<Researchelementdefinition_characteristicStudyeffectivegroupmeasure> studyEffectiveGroupMeasure(
      );

  Optional<CodeableConcept> unitOfMeasure();

  Optional<List<Extension>> extension();

  Optional<String> studyEffectiveDateTime();

  Optional<String> participantEffectiveDescription();

  Optional<Duration> participantEffectiveTimeFromStart();

  Optional<Expression> definitionExpression();

  Optional<String> id();

  Optional<Duration> studyEffectiveDuration();

  Optional<List<UsageContext>> usageContext();

  Optional<Period> participantEffectivePeriod();

  Optional<List<Extension>> modifierExtension();

  Optional<Timing> participantEffectiveTiming();

  Optional<Duration> participantEffectiveDuration();

  Optional<Period> studyEffectivePeriod();

  Optional<CodeableConcept> definitionCodeableConcept();

  Optional<DataRequirement> definitionDataRequirement();

  Optional<Duration> studyEffectiveTimeFromStart();

  Optional<Researchelementdefinition_characteristicParticipanteffectivegroupmeasure> participantEffectiveGroupMeasure(
      );

  Optional<String> definitionCanonical();

  static ImmutableResearchElementDefinition_Characteristic.Builder builder() {
    return ImmutableResearchElementDefinition_Characteristic.builder();
  }
}
