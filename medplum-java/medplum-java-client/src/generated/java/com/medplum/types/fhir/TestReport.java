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
    as = ImmutableTestReport.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface TestReport {
  Optional<DateTime> issued();

  Optional<Id> id();

  Optional<Narrative> text();

  Optional<List<ResourceList>> contained();

  Optional<List<TestReport_Participant>> participant();

  Optional<Code> language();

  Optional<List<TestReport_Test>> test();

  Optional<TestReport_Teardown> teardown();

  Optional<List<Extension>> extension();

  Optional<List<Extension>> modifierExtension();

  Optional<Uri> implicitRules();

  Optional<Decimal> score();

  Optional<String> name();

  Reference testScript();

  Optional<TestReport_Setup> setup();

  Optional<TestreportStatus> status();

  Optional<Meta> meta();

  Optional<TestreportResult> result();

  Optional<String> tester();

  String resourceType();

  Optional<Identifier> identifier();

  static ImmutableTestReport.TestScriptBuildStage builder() {
    return ImmutableTestReport.builder();
  }
}
