package com.fhir;

import com.StagedBuilderStyle;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

@Value.Immutable
@StagedBuilderStyle
@JsonDeserialize(
    as = ImmutableCapabilityStatement_Resource.class
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public interface CapabilityStatement_Resource {
  Optional<List<Extension>> extension();

  Optional<Capabilitystatement_resourceConditionalread> conditionalRead();

  Optional<List<CapabilityStatement_SearchParam>> searchParam();

  Optional<List<Extension>> modifierExtension();

  Optional<Boolean> conditionalCreate();

  Optional<Capabilitystatement_resourceConditionaldelete> conditionalDelete();

  Optional<List<String>> searchInclude();

  Optional<String> id();

  Optional<canonical> profile();

  Optional<Capabilitystatement_resourceVersioning> versioning();

  Optional<markdown> documentation();

  Optional<List<CapabilityStatement_Interaction>> interaction();

  Optional<List<canonical>> supportedProfile();

  Optional<List<Capabilitystatement_resourceReferencepolicyItem>> referencePolicy();

  Optional<List<String>> searchRevInclude();

  Optional<List<CapabilityStatement_Operation>> operation();

  Optional<Boolean> conditionalUpdate();

  Optional<code> type();

  Optional<Boolean> readHistory();

  Optional<Boolean> updateCreate();

  static ImmutableCapabilityStatement_Resource.Builder builder() {
    return ImmutableCapabilityStatement_Resource.builder();
  }
}
