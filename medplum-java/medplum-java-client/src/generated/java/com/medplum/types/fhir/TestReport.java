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
  Optional<Narrative> text();

  Optional<Id> id();

  Optional<List<ResourceList>> contained();

  Optional<TestReport_Teardown> teardown();

  Reference testScript();

  Optional<Decimal> score();

  Optional<Code> language();

  Optional<String> tester();

  Optional<List<Extension>> extension();

  Optional<TestreportStatus> status();

  Optional<List<TestReport_Participant>> participant();

  Optional<Uri> implicitRules();

  Optional<TestReport_Setup> setup();

  Optional<Identifier> identifier();

  Optional<TestreportResult> result();

  String resourceType();

  Optional<String> name();

  Optional<DateTime> issued();

  Optional<List<Extension>> modifierExtension();

  Optional<List<TestReport_Test>> test();

  Optional<Meta> meta();

  static ImmutableTestReport.TestScriptBuildStage builder() {
    return ImmutableTestReport.builder();
  }
}
