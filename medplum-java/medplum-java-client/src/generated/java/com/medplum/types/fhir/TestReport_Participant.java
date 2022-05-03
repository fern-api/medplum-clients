package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.medplum.StagedBuilderStyle;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableTestReport_Participant.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport_Participant {
  Optional<Testreport_participantType> type();

  Optional<List<Extension>> modifierExtension();

  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<String> display();

  Optional<Uri> uri();

  static ImmutableTestReport_Participant.Builder builder() {
    return ImmutableTestReport_Participant.builder();
  }
}
