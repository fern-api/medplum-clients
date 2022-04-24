package com.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserConfiguration_Menu}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration_Menu.builder()}.
 */
@Generated(from = "UserConfiguration_Menu", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration_Menu implements UserConfiguration_Menu {
  private final @Nullable List<UserConfiguration_Menu_Link> link;
  private final @Nullable String title;

  private ImmutableUserConfiguration_Menu(
      @Nullable List<UserConfiguration_Menu_Link> link,
      @Nullable String title) {
    this.link = link;
    this.title = title;
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<UserConfiguration_Menu_Link>> link() {
    return Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Menu#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu withLink(List<UserConfiguration_Menu_Link> value) {
    @Nullable List<UserConfiguration_Menu_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableUserConfiguration_Menu(newValue, this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Menu#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration_Menu withLink(Optional<? extends List<UserConfiguration_Menu_Link>> optional) {
    @Nullable List<UserConfiguration_Menu_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableUserConfiguration_Menu(value, this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Menu#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableUserConfiguration_Menu(this.link, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Menu#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Menu withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableUserConfiguration_Menu(this.link, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration_Menu} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration_Menu
        && equalTo((ImmutableUserConfiguration_Menu) another);
  }

  private boolean equalTo(ImmutableUserConfiguration_Menu another) {
    return Objects.equals(link, another.link)
        && Objects.equals(title, another.title);
  }

  /**
   * Computes a hash code from attributes: {@code link}, {@code title}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(title);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration_Menu} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("UserConfiguration_Menu{");
    if (link != null) {
      builder.append("link=").append(link);
    }
    if (title != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("title=").append(title);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UserConfiguration_Menu", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfiguration_Menu {
    @Nullable Optional<List<UserConfiguration_Menu_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @JsonProperty("link")
    public void setLink(Optional<List<UserConfiguration_Menu_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @Override
    public Optional<List<UserConfiguration_Menu_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration_Menu fromJson(Json json) {
    ImmutableUserConfiguration_Menu.Builder builder = ImmutableUserConfiguration_Menu.builder();
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    return (ImmutableUserConfiguration_Menu) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfiguration_Menu} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfiguration_Menu instance
   */
  public static UserConfiguration_Menu copyOf(UserConfiguration_Menu instance) {
    if (instance instanceof ImmutableUserConfiguration_Menu) {
      return (ImmutableUserConfiguration_Menu) instance;
    }
    return ImmutableUserConfiguration_Menu.builder()
        .link(instance.link())
        .title(instance.title())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration_Menu UserConfiguration_Menu}.
   * <pre>
   * ImmutableUserConfiguration_Menu.builder()
   *    .link(List&amp;lt;com.fhir.UserConfiguration_Menu_Link&amp;gt;) // optional {@link UserConfiguration_Menu#link() link}
   *    .title(String) // optional {@link UserConfiguration_Menu#title() title}
   *    .build();
   * </pre>
   * @return A new UserConfiguration_Menu builder
   */
  public static ImmutableUserConfiguration_Menu.Builder builder() {
    return new ImmutableUserConfiguration_Menu.Builder();
  }

  /**
   * Builds instances of type {@link UserConfiguration_Menu UserConfiguration_Menu}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserConfiguration_Menu", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LINK = 0x1L;
    private static final long OPT_BIT_TITLE = 0x2L;
    private long optBits;

    private @Nullable List<UserConfiguration_Menu_Link> link;
    private @Nullable String title;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Menu#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<UserConfiguration_Menu_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Menu#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<UserConfiguration_Menu_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Menu#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Menu#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration_Menu UserConfiguration_Menu}.
     * @return An immutable instance of UserConfiguration_Menu
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public UserConfiguration_Menu build() {
      return new ImmutableUserConfiguration_Menu(link, title);
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of UserConfiguration_Menu is strict, attribute is already set: ".concat(name));
    }
  }
}
