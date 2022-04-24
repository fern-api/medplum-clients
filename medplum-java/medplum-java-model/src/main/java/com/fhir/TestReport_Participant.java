package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
  Optional<String> id();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<uri> uri();

  Optional<String> display();

  Optional<Testreport_participantType> type();

  static ImmutableTestReport_Participant.Builder builder() {
    return ImmutableTestReport_Participant.builder();
  }
}
