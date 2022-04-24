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
    as = ImmutableTestReport.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport {
  Optional<Narrative> text();

  Optional<id> id();

  Optional<uri> implicitRules();

  Optional<Identifier> identifier();

  Reference testScript();

  Optional<Meta> meta();

  Optional<String> tester();

  Optional<TestreportStatus> status();

  Optional<TestReport_Teardown> teardown();

  Optional<List<ResourceList>> contained();

  String resourceType();

  Optional<TestReport_Setup> setup();

  Optional<decimal> score();

  Optional<dateTime> issued();

  Optional<List<TestReport_Test>> test();

  Optional<List<Extension>> modifierExtension();

  Optional<List<Extension>> extension();

  Optional<TestreportResult> result();

  Optional<code> language();

  Optional<String> name();

  Optional<List<TestReport_Participant>> participant();

  static ImmutableTestReport.TestScriptBuildStage builder() {
    return ImmutableTestReport.builder();
  }
}
