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
  Optional<String> tester();

  Optional<List<ResourceList>> contained();

  Optional<List<TestReport_Participant>> participant();

  String resourceType();

  Optional<String> name();

  Optional<TestreportStatus> status();

  Optional<TestreportResult> result();

  Optional<Code> language();

  Reference testScript();

  Optional<Decimal> score();

  Optional<Id> id();

  Optional<Identifier> identifier();

  Optional<Narrative> text();

  Optional<TestReport_Setup> setup();

  Optional<DateTime> issued();

  Optional<List<TestReport_Test>> test();

  Optional<Uri> implicitRules();

  Optional<List<Extension>> modifierExtension();

  Optional<TestReport_Teardown> teardown();

  Optional<List<Extension>> extension();

  Optional<Meta> meta();

  static ImmutableTestReport.ResourceTypeBuildStage builder() {
    return ImmutableTestReport.builder();
  }
}
