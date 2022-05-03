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
  Optional<List<Extension>> extension();

  Optional<String> id();

  Optional<String> display();

  Optional<Uri> uri();

  Optional<List<Extension>> modifierExtension();

  Optional<Testreport_participantType> type();

  static ImmutableTestReport_Participant.Builder builder() {
    return ImmutableTestReport_Participant.builder();
  }
}
