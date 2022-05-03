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
  Optional<Meta> meta();

  Optional<String> name();

  String resourceType();

  Reference testScript();

  Optional<Decimal> score();

  Optional<List<TestReport_Test>> test();

  Optional<TestreportStatus> status();

  Optional<List<TestReport_Participant>> participant();

  Optional<TestReport_Setup> setup();

  Optional<List<ResourceList>> contained();

  Optional<Identifier> identifier();

  Optional<Code> language();

  Optional<List<Extension>> extension();

  Optional<Id> id();

  Optional<TestreportResult> result();

  Optional<DateTime> issued();

  Optional<Narrative> text();

  Optional<Uri> implicitRules();

  Optional<TestReport_Teardown> teardown();

  Optional<List<Extension>> modifierExtension();

  Optional<String> tester();

  static ImmutableTestReport.ResourceTypeBuildStage builder() {
    return ImmutableTestReport.builder();
  }
}
